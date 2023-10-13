package com.edwardjones.saamigo.summary;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("summary")
public class SummaryController {

    private final BedrockSummaryService summaryService;

    @PostMapping
    public Mono<String> summarizeText(@RequestBody String text) {
        return summaryService.summarizeText(text, BedrockModel.COHERE_COMMAND);
    }

}
