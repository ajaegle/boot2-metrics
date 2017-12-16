# Boot 2 metrics

Sample application demonstrating the usage of spring boot 2 with micrometer
and the prometheus registry to generate metrics for Prometheus. The project
currently targets Spring Boot 2.0.0.M7 and Micrometer Prometheus Registry 
1.0.0-rc.5.

## Demo

The only Webflux controller contains a single endpoint returning a single result.
The micrometer library is used to track the timing of the endpoint. A custom counter
is used to track the total number of calls to the method.

## Actuator endpoint configuration

Some configuration changes in `application.properties` are used to provide the
well-known default `/metrics` endpoint for Prometheus.

## Docker build

The project also provides a Dockerfile with a multistage build to build and 
package the application as Docker image. A prebuilt image can be found on 
DockerHub at [ajaegle/boot2metrics](https://hub.docker.com/r/ajaegle/boot2metrics/).

Run the image via `docker run -it --rm -p 8080:8080 ajaegle/boot2metrics:1.2.0`
