package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class ReportFieldSetMapper implements FieldSetMapper<Report> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    
    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        
        Report report = new Report();
        report.setDate(fieldSet.readDate(0).toString());
        report.setImpressions(fieldSet.readString(1));
        report.setClicks(fieldSet.readInt(2));
        report.setEarning(fieldSet.readDouble(3));
        
        //default format yyyy-MM-dd
        //fieldSet.readDate(4);
        String date = fieldSet.readString(0);
        /*try {
            report.setDate(dateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        
        return report;
        
    }

}