package io.helidon.examples.quickstart.mp;

import io.vertx.core.*;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class VertxDeployer {
    @Inject
    private HelloVerticle helloVerticle;

    private final Vertx vertx;

    @Inject
    public VertxDeployer() {
        vertx = Vertx.vertx();

        System.out.println("Deploying verticles now");

        vertx.deployVerticle(helloVerticle);
    }

    public void deployVerticle(Verticle verticle, DeploymentOptions options, Handler<AsyncResult<String>> handler) {
        vertx.deployVerticle(verticle, options, handler);
    }

    public Future<String> deployVerticle(Verticle verticle, DeploymentOptions options) {
        return vertx.deployVerticle(verticle, options);
    }
}
