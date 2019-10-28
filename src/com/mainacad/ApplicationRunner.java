package com.mainacad;

import com.mainacad.service.FileService;

import java.util.logging.Logger;


public class ApplicationRunner {

    private static final Logger LOGGER =
            Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        FileService.copyFile("cat.jpg", "cat_copy.jpg");
    }
}
