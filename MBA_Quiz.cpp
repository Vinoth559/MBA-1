#include <iostream>
#include <string>
#include <map>
using namespace std;

int main() {
    string questions[20] = { /* Questions as previously defined */ };
    string options[20][5] = { /* Options as previously defined */ };
    string values[20][5] = { /* Values as previously defined */ };

    map<string,int> score;
    score["HR"] = 0; score["Marketing"] = 0; score["Finance"] = 0;
    score["Operations"] = 0; score["Consulting"] = 0;

    int choice;
    for(int i=0;i<20;i++){
        cout << questions[i] << endl;
        for(int j=0;j<5;j++) cout << j+1 << ". " << options[i][j] << endl;
        cout << "Enter your choice (1-5): ";
        cin >> choice;
        while(choice < 1 || choice > 5){ cout << "Invalid! Enter 1-5: "; cin >> choice; }
        score[values[i][choice-1]]++;
        cout << endl;
    }

    string result=""; int maxScore=0;
    for(auto &p:score) if(p.second>maxScore){ maxScore=p.second; result=p.first; }

    cout << "=========================" << endl;
    if(result=="HR") cout << "You are suitable for HR roles: Recruiter, Talent Manager, HR Business Partner." << endl;
    else if(result=="Marketing") cout << "You are suitable for Marketing roles: Brand Manager, Digital Marketing, Sales Manager." << endl;
    else if(result=="Finance") cout << "You are suitable for Finance roles: Financial Analyst, Investment Banker, Accountant." << endl;
    else if(result=="Operations") cout << "You are suitable for Operations roles: Supply Chain Manager, Operations Manager, Project Manager." << endl;
    else if(result=="Consulting") cout << "You are suitable for Consulting roles: Business Consultant, Strategy Consultant, Management Consultant." << endl;
    return 0;
}
