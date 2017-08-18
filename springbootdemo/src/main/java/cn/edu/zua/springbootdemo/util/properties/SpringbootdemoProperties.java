package cn.edu.zua.springbootdemo.util.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * SpringbootdemoProperties
 * Created by ascend on 2017/8/18 11:35.
 */
@Component
public class SpringbootdemoProperties {
    @Value("${cn.edu.zua.springbootdemo.title}")
    private String title;
    @Value("${cn.edu.zua.springbootdemo.description}")
    private String description;

    public SpringbootdemoProperties() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
