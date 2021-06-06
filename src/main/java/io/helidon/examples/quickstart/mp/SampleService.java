package io.helidon.examples.quickstart.mp;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Singleton;

@ApplicationScoped
public class SampleService {
    @Inject
    public SampleService() {
        System.out.println("Start Sample Service");
    }
}
