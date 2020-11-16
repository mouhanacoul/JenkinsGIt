package br.com.test.convers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.temperatura.convers.ConversTemp;

public class ConversorTest {

    private ConversTemp conversorTest = new ConversTemp('C', 10);

    public static final char ESCALA_TEST = 'K';
    public static final double TEMP_KELVIN_TEST = 283.0;

    @Test
    public void testeConvertendoDeCelsiusParaKelvin() {
        conversorTest.converter('K');

        assertEquals(conversorTest.getTemp().getEscala(), ESCALA_TEST);
        assertEquals(conversorTest.getTemp().getTemperatura(), TEMP_KELVIN_TEST);
    }
}