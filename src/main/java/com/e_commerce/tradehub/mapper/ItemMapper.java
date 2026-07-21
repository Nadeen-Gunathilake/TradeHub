package com.e_commerce.tradehub.mapper;

import com.e_commerce.tradehub.dto.ItemRequestDto;
import com.e_commerce.tradehub.dto.ItemResponseDto;
import com.e_commerce.tradehub.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item toEntity(ItemRequestDto dto){
        final Item entity = new Item();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setShippingWeight(dto.getShippingWeight());
        entity.setQuantityInStock(dto.getQuantityInStock());
        return entity;
    }

    public void updateEntity(Item entity, ItemRequestDto dto) {
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setShippingWeight(dto.getShippingWeight());
        entity.setQuantityInStock(dto.getQuantityInStock());
    }

    public ItemResponseDto toResponse(Item entity){
        final ItemResponseDto dto = new ItemResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setShippingWeight(entity.getShippingWeight());
        dto.setQuantityInStock(entity.getQuantityInStock());
        return dto;
    }
}
