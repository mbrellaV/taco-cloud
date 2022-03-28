package com.mbrella.tacocloud.repositories;

import com.mbrella.tacocloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}