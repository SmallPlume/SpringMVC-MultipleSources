package commons;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import commons.annotation.DataSourceChange;
import exceptions.DataSourceAspectException;

/**
 * 有{@link com.wangzhixuan.commons.annotation.DataSourceChange}注解的方法，调用时会切换到指定的数据源
 *
 */
@Aspect
@Component
public class DataSourceAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceAspect.class);

	@Around("@annotation(dataSourceChange)")
	public Object doAround(ProceedingJoinPoint pjp, DataSourceChange dataSourceChange) {
		Object retVal = null;
		boolean selectedDataSource = false;
		try {
			if (null != dataSourceChange) {
				selectedDataSource = true;
				
				System.out.println(dataSourceChange.slave());
				
				if (dataSourceChange.slave()) {
					DynamicDataSource.useSlave();
				} else {
					DynamicDataSource.useMaster();
				}
			}
			retVal = pjp.proceed();
		} catch (Throwable e) {
			LOGGER.warn("数据源切换错误", e);
			throw new DataSourceAspectException("数据源切换错误", e);
		} finally {
			if (selectedDataSource) {
				DynamicDataSource.reset();
			}
		}
		return retVal;
	}
}
