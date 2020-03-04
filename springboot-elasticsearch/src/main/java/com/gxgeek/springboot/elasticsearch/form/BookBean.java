package com.gxgeek.springboot.elasticsearch.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by gx
 * Date: 2017-09-13
 * Time: 22:10
 */
@Data
public class BookBean {

    private String id;
    private String title;
    private String author;
    private Integer word_count;
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date public_date;


}
