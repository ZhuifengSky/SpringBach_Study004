package com.main;

import org.springframework.batch.item.ItemProcessor;


 
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
 
	@Override
	public Report process(Report report) throws Exception {
		System.out.println("���ݴ���:" + report);
		return report;
	}
 
}
