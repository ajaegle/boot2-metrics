package de.ajaegle.sample.monitoring.boot2metrics;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SomeController {

    private Counter hellos = Metrics.counter("hellos");

    @Timed
    @GetMapping("/")
    public Map<String,String> index() {
        hellos.increment();
        return new HashMap<String, String>() {{ put("hello", "world"); }};
    }

}
