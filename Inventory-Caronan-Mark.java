#include <iostream>
using namespace std;

int main() {
    string item;
    int quantity, choice;
    double price;
    
    cout << "===== CARONAN INVENTORY SYSTEM =====" << endl;
    cout << " ----- INVENTORY MENU -----" << endl;
    cout << "1. Add Items" << endl;
    cout << "2. View Items" << endl;
    cout << "3. Show Total Value" << endl;
    cout << "0. Exit" << endl;
    cout << "Enter your Choice: ";
    cin >> choice;

    cout << endl;

    switch(choice) {
        case 1:
        cout << "===== ADD ITEM =====" << endl;
        cout << "Enter Item Name: ";
        cin >> item;

        cout << "Enter Quantity: ";
        cin >> quantity;

        cout << "Enter Price: ";
        cin >> price;
        cout << "Item Added!";
    }
    return 0;
}