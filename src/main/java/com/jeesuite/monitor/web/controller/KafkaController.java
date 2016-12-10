/**
 * 
 */
package com.jeesuite.monitor.web.controller;

import java.util.List;
import java.util.Map;

import com.jeesuite.kafka.monitor.KafkaMonitor;
import com.jeesuite.kafka.monitor.model.ConsumerGroupInfo;
import com.jeesuite.kafka.monitor.model.ProducerInfo;
import com.jeesuite.kafka.monitor.model.ProducerStat;
import com.jeesuite.monitor.component.KafkaMonitorContext;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2016年10月28日
 */
//@Before(AuthInterceptor.class)
public class KafkaController extends BaseController {

	
	public void brokers() {
		KafkaMonitor monitor = KafkaMonitorContext.get(getEnv());
		if(monitor == null){
			return ;
		}
		setAttr("brokers", monitor.getAllBrokers());
		render("brokers.html");
	}

	public void consumers() {
		KafkaMonitor monitor = KafkaMonitorContext.get(getEnv());
		if(monitor == null){
			return ;
		}
		List<ConsumerGroupInfo> groupInfos = monitor.getAllConsumerGroupInfos();
        setAttr("consumerGroups", groupInfos);
		render("consumers.html");
	}
	
	public void producers() {
		KafkaMonitor monitor = KafkaMonitorContext.get(getEnv());
		if(monitor == null){
			return ;
		}
		List<ProducerInfo> producerStats = monitor.getProducerStats();
		setAttr("producerStats", producerStats);
		render("producers.html");
	}

}
