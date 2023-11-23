package br.ufrn.imd.model;

public class Table {
    int size;
    char[][] field;

    Table(int size) {
        this.size = size;
        field = new char[size][size];
    }

    void clear() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                field[i][j] = ' ';
    }
}
