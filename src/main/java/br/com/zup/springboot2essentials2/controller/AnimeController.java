package br.com.zup.springboot2essentials2.controller;

import br.com.zup.springboot2essentials2.domain.Anime;
import br.com.zup.springboot2essentials2.service.AnimeService;
import br.com.zup.springboot2essentials2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@AllArgsConstructor
public class AnimeController {


    private DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatlocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll() ;
    }

}
