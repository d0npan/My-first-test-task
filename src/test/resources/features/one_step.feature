#coding: utf-8
Feature: Add product from basket

  Scenario: Open catalog
    Then Click "Игрушки" button
    Then Click "Игрушки для мальчиков" sub_button
    Then Click "Машина р/у 1:10 Краулер MZ 2837 +акб" item
    Then Click "Добавить в корзину" basket_button
    Then Click "Перейти в корзину" go_basket_button
    Then Price product should be "2 990 ₽"
    Then Name product should be "Машина р/у 1:10 Краулер MZ 2837 +акб"





