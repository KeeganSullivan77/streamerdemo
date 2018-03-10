package com.streamer.demo.cucumber.stepdefs;

import com.streamer.demo.StreamerdemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = StreamerdemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
