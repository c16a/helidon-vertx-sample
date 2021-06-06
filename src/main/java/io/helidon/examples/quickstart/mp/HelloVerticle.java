package io.helidon.examples.quickstart.mp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloVerticle extends AbstractVerticle {
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        System.out.println("Started HelloVerticle");
        super.start(startPromise);
    }
}
