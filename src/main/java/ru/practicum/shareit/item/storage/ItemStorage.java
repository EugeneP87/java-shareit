package ru.practicum.shareit.item.storage;

import ru.practicum.shareit.item.Item;
import ru.practicum.shareit.item.dto.ItemDto;

import java.util.Collection;

public interface ItemStorage {

    ItemDto create(Integer userId, ItemDto itemDto);

    ItemDto update(int itemId, int userId, ItemDto itemDto);

    Collection<ItemDto> findAllUserItems(int userId);

    Item getItemById(int itemId);

}