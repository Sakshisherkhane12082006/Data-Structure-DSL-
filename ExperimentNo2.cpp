#include <iostream>
using namespace std;

int main() {
    int A[2][2], B[2][2];
    int add[2][2], sub[2][2], mul[2][2];

    cout << "Enter elements of first matrix:\n";
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cin >> A[i][j];
        }
    }

    cout << "Enter elements of second matrix:\n";
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cin >> B[i][j];
        }
    }

    // Addition
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            add[i][j] = A[i][j] + B[i][j];
        }
    }

    // Subtraction
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            sub[i][j] = A[i][j] - B[i][j];
        }
    }

    // Multiplication
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            mul[i][j] = 0;
            for (int k = 0; k < 2; k++) {
                mul[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    cout << "\nAddition:\n";
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << add[i][j] << " ";
        }
        cout << endl;
    }

    cout << "\nSubtraction:\n";
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << sub[i][j] << " ";
        }
        cout << endl;
    }

    cout << "\nMultiplication:\n";
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << mul[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
