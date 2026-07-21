package com.e_commerce.tradehub.controller;

import com.e_commerce.tradehub.dto.ItemRequestDto;
import com.e_commerce.tradehub.dto.ItemResponseDto;
import com.e_commerce.tradehub.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemResponseDto>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDto> getItemById(
            @PathVariable Long id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }

    @PostMapping
    public ResponseEntity<ItemResponseDto> addItem(
            @Valid @RequestBody ItemRequestDto dto) {
        return ResponseEntity
                .status(org.springframework.http.HttpStatus.CREATED)
                .body(itemService.addItem(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemResponseDto> updateItem(
            @PathVariable Long id,
            @Valid @RequestBody ItemRequestDto dto) {
        return ResponseEntity.ok(itemService.updateItem(dto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemById(
            @PathVariable Long id) {
        itemService.deleteItemById(id);
        return ResponseEntity.noContent().build();
    }
}