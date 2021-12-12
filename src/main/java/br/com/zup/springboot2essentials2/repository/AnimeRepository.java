package br.com.zup.springboot2essentials2.repository;

import br.com.zup.springboot2essentials2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
