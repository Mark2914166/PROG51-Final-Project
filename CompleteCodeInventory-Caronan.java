
#include <iostream>
using namespace std;
int main() {
    string item[100];
    int quantity[100], choice;
    double price[100];
    int count = 0;
    double totalValue = 0;

    do {
        cout << "\n===== CARONAN INVENTORY SYSTEM =====" << endl;
        cout << " ----- INVENTORY MENU -----" << endl;
        cout << "1. Add Items" << endl;
        cout << "2. View Items" << endl;
        cout << "3. Show Total Value" << endl;
        cout << "4. Exit" << endl;
        cout << "Enter your Choice: ";
        cin >> choice;

        cout << endl;

        switch(choice) {

            case 1:
                cout << "===== ADD ITEM =====" << endl;

                if(count >= 100) {
                    cout << "Inventory is Full!";
                    break;
                }

                cout << "Enter Item Name: ";
                cin >> item[count];

                cout << "Enter Quantity: ";
                cin >> quantity[count];

                cout << "Enter Price: ";
                cin >> price[count];

                count++;

                cout << "Item Added Successfully!";
                break;

            case 2:
                cout << "===== VIEW ITEMS =====" << endl;

                if(count == 0) {
                    cout << "No Items Available!" << endl;
                }
                else {
                    for(int i = 0; i < count; i++) {
                        cout << "\nItem Name: " << item[i] << endl;
                        cout << "Quantity: " << quantity[i] << endl;
                        cout << "Price: " << price[i] << endl;
                        cout << "------------------------" << endl;
                    }
                }
                break;

            case 3:
                cout << "===== TOTAL INVENTORY VALUE =====" << endl;

                if(count == 0) {
                    cout << "No Items Available!" << endl;
                }
                else {
                    totalValue = 0;

                    for(int i = 0; i < count; i++) {
                        totalValue += quantity[i] * price[i];
                    }

                    cout << "Total Inventory Value: " << totalValue << endl;
                }
                break;

            case 4:
                cout << "Thank you for using CARONAN INVENTORY SYSTEM!";
                break;

            default:
                cout << "Invalid Choice! Please try again.";
        }

        cout << endl;

    } while(choice != 4);

    return 0;
}
