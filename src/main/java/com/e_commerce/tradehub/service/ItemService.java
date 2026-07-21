package com.e_commerce.tradehub.service;

import com.e_commerce.tradehub.dto.ItemRequestDto;
import com.e_commerce.tradehub.dto.ItemResponseDto;

import java.util.List;

public interface ItemService {
    ItemResponseDto addItem(ItemRequestDto dto);
    ItemResponseDto getItemById(Long id);
    ItemResponseDto updateItem(ItemRequestDto dto, Long id);
    void deleteItemById(Long id);
    List<ItemResponseDto> getAllItems();
}
