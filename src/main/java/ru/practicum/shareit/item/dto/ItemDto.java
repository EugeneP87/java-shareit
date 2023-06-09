package ru.practicum.shareit.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.practicum.shareit.request.ItemRequest;

/**
 * Класс ItemDto имеет следующие поля:
 *
 * @id — уникальный идентификатор вещи;
 * @name — краткое название;
 * @description — развёрнутое описание;
 * @available — статус о том, доступна или нет вещь для аренды;
 * @request — если вещь была создана по запросу другого пользователя, то в этом
 * поле будет храниться ссылка на соответствующий запрос.
 */
@Data
@AllArgsConstructor
public class ItemDto {

    private Integer id;
    private String name;
    private String description;
    private Boolean available;
    private ItemRequest request;

}