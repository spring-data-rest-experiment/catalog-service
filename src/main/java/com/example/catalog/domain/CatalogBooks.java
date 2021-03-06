package com.example.catalog.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class CatalogBooks {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Long catalogId;

    @NotNull
    private Long bookId;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public Long getCatalogId() {
        return catalogId;
    }

    @JsonProperty("id")
    public Long getBookId() {
        return bookId;
    }
}
