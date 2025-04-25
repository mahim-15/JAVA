#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
#include <cstdlib>
using namespace std;

void displayArray(const vector <int> & arr) {
    cout << "Current Array: ";
    for (int num : arr) {
        cout << num << " ";
    }
    cout << "\n";
}

int main() {
    ifstream inputFile("data.txt");
    if (!inputFile) {
        cerr << "Unable to open file.\n";
        return 1;
    }

    vector<int> array;
    int num;
    while (inputFile >> num) {
        array.push_back(num);
    }
    inputFile.close();
    while (true) {
        system("CLS");
        displayArray(array);
        cout << "\nChoose an operation:\n";
        cout << "1. Insert Element\n";
        cout << "2. Delete Element\n";
        cout << "3. Exit\n";
        cout << "Enter your choice: ";
        int choice;
        cin >> choice;
        if (choice == 1) {
            cout << "Enter the element to insert: ";
            int element;
            cin >> element;
            array.push_back(element);
            cout << "Element inserted successfully.\n";
        }
        else if(choice==2){
            cout<< "Enter the element to delete: ";
            int element;
            cin>>element;
            auto it=find(array.begin(),array.end(),element);
            if (it!=array.end()) {
                array.erase(it);
                cout << "Element deleted successfully.\n";
            }
            else cout<<"Element not found in the array.\n";
        }
        else if(choice==3)break;
        else cout << "Invalid choice. Please try again.\n";

        cout << "Press Enter to continue...";
        cin.ignore();
        cin.get();
    }
    system("CLS");
    cout << "Goodbye!\n";
    return 0;
}
