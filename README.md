# Compilador para linguagem Musy

Este foi um trabalho realizado na Universidade Federal de São Carlos (UFSCar) para a disciplina de Construção de Compiladores 2.
Consiste em um compilador para uma linguagem que descreve notas musicais. A linguagem possibilita a declaração de faixas de instrumentos, compassos, oitavas, BPM, notas, acordes e blocos de repetição; e transforma essas declarações em um script Python, que ao ser compilado, gera um arquivo MIDI, tornando possível ouvir a música criada.

## Exemplo de sintaxe da linguagem Musy

```javascript
MIDI TurkishMarch {
    BPM: 128
    TIME_SIGNATURE: 4/4
    TIME_NOTE: sc
    TIME_PAUSE: sc
    OCTAVE: 6

    chord(B(cl, 6),A(cl, 6)) ch1
    chord(A(cl, 6), F#(cl, 6)) ch2
    chord(G(cl, 6),E(cl, 6)) ch3
    chord(F#(cl, 6), D#(cl, 6)) ch4
    chord(E(cl, 6), B(5, cl)) ch5
    chord(A(4, cl), E(5, cl)) rch1
    chord(E(4, cl), B(4, cl)) rch2

    TRACK Lead : PIANO {
        I(sm), I(sm), I(sm),
        BLOCK main {
            B(5), A(5), G#(5), A(5), C, I, I, I, D, C, B(5), C, E,
            I, I, I, F, E, D#, E, B, A, G#, A, B, A, G#, A, C(7), I, I, I, A(6, cl), C(7, cl),
            ch1, ch2, ch3, ch2, ch1, ch2, ch3, ch2, ch1, ch2, ch3, ch4, ch5, I, I
        },
        block main
    }

    TRACK Rythm : PIANO {
        I(sb),
        BLOCK rtmain {
            A(3, cl), rch1, rch1, rch1, A(3, cl), rch1, rch1, rch1, A(3, cl), rch1, rch1, rch1,
            A(3, cl), rch1, rch1, rch1, E(3, cl), rch2, rch2, rch2, E(3, cl), rch2, rch2, rch2, 
            E(3, cl), E(4, cl), E(3, cl), E(4, cl), E(3, cl), I(cl), I(cl), I(cl)
        },
        block rtmain
    }
}
```

## Ferramentas utilizadas
Framework Xtext - https://eclipse.org/Xtext/

Linguagem Xtend - http://www.eclipse.org/xtend/

Biblioteca Python MIDI - https://github.com/vishnubob/python-midi
