FROM airhacks/glassfish
COPY ./target/thread-counter.war ${DEPLOYMENT_DIR}
