package com.tech.engg5.telemetry.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication
public class TelemetrySchedulerApplication {
  public static void main(String[] args) {
    ReactorDebugAgent.init();
    System.setProperty("APP_ID", "1000165");
    System.setProperty("APP_NAME", "task-telemetry-scheduler");
    SpringApplication application = new SpringApplication(TelemetrySchedulerApplication.class);
    application.run(args);
  }
}
