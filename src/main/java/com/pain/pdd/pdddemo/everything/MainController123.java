package com.pain.pdd.pdddemo.everything;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/random-endpoint-name")
public class MainController123 {

    private final SomeServiceThatDoesNothing someService;
    private final RandomResponseService randomResponseService;
    private final ExaggeratedConversionService exaggeratedConversionService;
    private final RateLimiterService rateLimiterService;
    private final UselessCacheService uselessCacheService;
    private final InfiniteProgressionService infiniteProgressionService;
    private final AbsurdTimeService absurdTimeService;
    private final InfiniteFibonacciService infiniteFibonacciService;
    private final RandomAnswerService randomAnswerService;

    // Injection via le constructeur
    @Autowired
    public MainController123(SomeServiceThatDoesNothing someService,
                             RandomResponseService randomResponseService,
                             ExaggeratedConversionService exaggeratedConversionService,
                             RateLimiterService rateLimiterService,
                             UselessCacheService uselessCacheService,
                             InfiniteProgressionService infiniteProgressionService,
                             AbsurdTimeService absurdTimeService,
                             InfiniteFibonacciService infiniteFibonacciService,
                             RandomAnswerService randomAnswerService) {
        this.someService = someService;
        this.randomResponseService = randomResponseService;
        this.exaggeratedConversionService = exaggeratedConversionService;
        this.rateLimiterService = rateLimiterService;
        this.uselessCacheService = uselessCacheService;
        this.infiniteProgressionService = infiniteProgressionService;
        this.absurdTimeService = absurdTimeService;
        this.infiniteFibonacciService = infiniteFibonacciService;
        this.randomAnswerService = randomAnswerService;
    }

    @GetMapping("/something")
    public String doSomethingRandom() {
        return someService.doAbsolutelyNothing();
    }

    @GetMapping("/another")
    public String anotherRandomThing() {
        return "Encore une absurdité.";
    }

    @GetMapping("/throw-error")
    public String throwError() {
        throw new RuntimeException("Erreur intentionnelle pour le plaisir de PDD.");
    }

    @GetMapping("/random-response")
    public String getRandomResponse() {
        return randomResponseService.getRandomResponse();
    }

    @GetMapping("/convert/{number}")
    public String convert(@PathVariable int number) {
        return exaggeratedConversionService.convertNumber(number);
    }

    @GetMapping("/rate-limit")
    public String rateLimit() {
        return rateLimiterService.handleRequest();
    }

    @GetMapping("/cache")
    public String cacheData(@RequestParam String key, @RequestParam String value) {
        return uselessCacheService.cacheData(key, value);
    }

    @GetMapping("/get-cache")
    public String getCachedData(@RequestParam String key) {
        return uselessCacheService.getCachedData(key);
    }

    @GetMapping("/infinite-progress")
    public String infiniteProgress() {
        return infiniteProgressionService.getProgress();
    }

    @GetMapping("/absurd-time")
    public String absurdTime() {
        return absurdTimeService.getAbsurdTime();
    }

    @GetMapping("/infinite-fibonacci")
    public String infiniteFibonacci() {
        return infiniteFibonacciService.calculateFibonacci();
    }

    @GetMapping("/random-answer")
    public String randomAnswer() {
        return randomAnswerService.getRandomAnswer();
    }

    @GetMapping("/index")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Bienvenue dans l'univers du Pain Driven Development!");
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
