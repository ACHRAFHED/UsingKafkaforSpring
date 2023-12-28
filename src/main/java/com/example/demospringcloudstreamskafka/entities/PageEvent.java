package com.example.demospringcloudstreamskafka.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor
@NoArgsConstructor
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;

}
