package kr.communityserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    //private String connectPath = "/imagePath/**";

    //
    //private String resourcePath = "file:///Users/Java/Desktop/WorkSpace/lotteon-team1/lotteon/uploads";
    // 배포
    // private String resourcePath = "file:///home/farmStory/prodImg/";


    @Autowired
    private ResourceLoader resourceLoader;


    /*
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(connectPath)
                .addResourceLocations(resourcePath);
    }
    */

    @Override
    public void  addResourceHandlers(ResourceHandlerRegistry registry) {
        String defaultPath = System.getProperty("user.dir");
        String imgPath = defaultPath + File.separator + "product" + File.separator;
        String filePath = defaultPath + File.separator + "uploads" + File.separator;
        registry
                .addResourceHandler("product/**")
                .addResourceLocations("file:///" + imgPath);
        registry
                .addResourceHandler("uploads/**")
                .addResourceLocations("file:///" + filePath);
    }

}
