package ru.evotor.framework.receipt

import java.math.BigDecimal

/**
 * Ставка НДС.
 *
 * Обратите внимание, что в связи с изменением законодательства, с первого января 2019 года реальное значение основной и расчётной ставок может указывать как на 18%, так и на 20%.
 * Наименования полей (VAT_18 и VAT_18_118), при этом не меняются.
 * Реальное значение ставки НДС зависит от того, имеет пользователь доступ к новому значению НДС или нет.
 *
 * Ставка НДС 20% активируется после приобритения и установки приложения "Пакет обновлений".
 *
 * Используйте метод [ru.evotor.framework.features.FeaturesApi.isVat20Active], чтобы проверить активна ставка НДС 20% у пользователя или нет.
 */
enum class TaxNumber(val value: BigDecimal) {
    /**
     * Основная ставка 18%. С первого января 2019 года может указывать как на 18%, так и на 20% ставку.
     */
    VAT_18(BigDecimal.valueOf(18)),
    /**
     * Основная ставка 10%.
     */
    VAT_10(BigDecimal.valueOf(10)),
    /**
     * Без НДС.
     */
    NO_VAT(BigDecimal.ZERO),
    /**
     * Расчётная ставка 18%. С первого января 2019 года может указывать как на 18%, так и на 20% ставку.
     */
    VAT_18_118(BigDecimal.valueOf(18)),
    /**
     * Расчётная ставка 10%.
     */
    VAT_10_110(BigDecimal.valueOf(10)),
    /**
     * Основная ставка 0%
     */
    VAT_0(BigDecimal.ZERO)
}