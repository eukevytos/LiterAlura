package br.com.alura.literAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDados(@JsonAlias("title") String titulo,
                         @JsonAlias("authors") List<AutorDados> authors,
                         @JsonAlias("languages") List<String> idioma,
                         @JsonAlias("download_count") Double numeroDownload) {
}
