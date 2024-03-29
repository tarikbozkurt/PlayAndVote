package com.playandvote.inventoryservice.business.dto.responses.gets;

import com.playandvote.inventoryservice.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoryResponse {
    private UUID id;
    private String name;
    private String information;

    private Set<Game> gameList;
}
