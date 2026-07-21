package com.e_commerce.tradehub.service.impl;

import com.e_commerce.tradehub.dto.ItemRequestDto;
import com.e_commerce.tradehub.dto.ItemResponseDto;
import com.e_commerce.tradehub.mapper.ItemMapper;
import com.e_commerce.tradehub.model.Item;
import com.e_commerce.tradehub.repository.ItemRepository;
import com.e_commerce.tradehub.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemResponseDto addItem(ItemRequestDto dto){
        Item item = itemMapper.toEntity(dto);
        Item savedItem = itemRepository.save(item);
        return itemMapper.toResponse(savedItem);
    };

    public ItemResponseDto getItemById(Long id){
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        return itemMapper.toResponse(item);
    }

    @Override
    public ItemResponseDto updateItem(ItemRequestDto dto, Long id){
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        itemMapper.updateEntity(item, dto);
        Item updatedItem = itemRepository.save(item);

        return itemMapper.toResponse(updatedItem);
    };

    @Override
    public void deleteItemById(Long id){
        if(itemRepository.existsById(id)){
            itemRepository.deleteById(id);
        } else {
            throw new RuntimeException("Item not found");
        }
    };

    @Override
    public List<ItemResponseDto> getAllItems(){
        List<Item> items = itemRepository.findAll();
        List<ItemResponseDto> responseDtoList = new ArrayList<>();

        for(Item item :items){
            ItemResponseDto dto = itemMapper.toResponse(item);
            responseDtoList.add(dto);
        }

        return responseDtoList;
    };
}
