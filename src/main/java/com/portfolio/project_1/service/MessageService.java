package com.portfolio.project_1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MessageService {
    private List<Map<String, String>> messages = new ArrayList<>() {{
        add(new HashMap<>() {{ put("id", "1"); put("text", "First message");}});
        add(new HashMap<>() {{ put("id", "2"); put("text", "Second message");}});
        add(new HashMap<>() {{ put("id", "3"); put("text", "Third message");}});

    }};
    @GetMapping
    public List<Map<String, String>> list() {
        return messages;
    }

    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return messages.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow();
    }
}
