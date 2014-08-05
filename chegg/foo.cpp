#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>

using namespace std;
const int NUM_PLAYERS=12;
const int COMPARED_PLAYER=2;
const int YEARS=12;
const int MIN_YEAR=2001;
const int MAX_YEAR=2012;

int getYear(int count);
void displayScreen();
char sortBy(char);
double sort(double*);
double sort2(string[NUM_PLAYERS],double*,double*,double*,int*,int*,string*);
double sort3(string[NUM_PLAYERS],double*,double*,double*,int*,int*,string*);
//double sort4(string[NUM_PLAYERS],double*,double*,double*,int*,int*,string*);
double sort5(string[NUM_PLAYERS],double*,double*,double*,int*,int*,string*);
void sortStrings(string[],int);
void displayInput(double*,double*,double*,string*,int*,int*,char&,double&,int*,int&,string*,int*,int*);
void displayOutput(double*,double*,double*,string*,int*,int*,string*);
void write(int*,int*,double*,double*,double*,string*,string*);
void searchPlayer(int player[],int*,string*,string *,double*,double*,int[2],double*);
int binarySearch(int[], int ,int );

int main()
{
    int s[YEARS]={2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011};//First part of season
    int nyears[YEARS]={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012};//Second part of season
    string player[NUM_PLAYERS]={"Allen Iverson","Tim Duncan","Tim Duncan","Kevin Garnett","Steve Nash","Steve Nash","Dirk Nowitzki","Kobe Bryant","Lebron James","Lebron James","Derrick Rose","Lebron James"};
    string position[NUM_PLAYERS]={"PG/SG","PF/C","PF/C","F","PG","PG","PF","SG","SF/SG","SF/SG","PG","SF/SG"};
    double ppg[NUM_PLAYERS]={31.1,25.5,23.3,24.2,15.5,18.8,24.6,28.3,28.4,29.7,25.0,27.1};
    double ast[NUM_PLAYERS]={4.6,3.7,3.9,5.0,11.5,10.5,3.4,5.4,7.2,8.6,7.7,6.2};
    double rbs[NUM_PLAYERS]={3.8,12.7,12.9,13.9,3.3,4.2,8.9,6.3,7.6,7.3,4.1,7.9};
    write(s,nyears,ppg,ast,rbs,player,position);//Write to file
    char st=0;
    double p=0;
    double h=0;

    ////////////searchPlayer/////////////////////
    int nsearch[YEARS];//For binarySearch of searchPlayer
    int count=0;//For searchPlayer
    int index[COMPARED_PLAYER];//For searchPlayer
    //////////////////////////////////////////////

    int compYears=0;
    char sby;
    char stp=0;
    int yrNum[32];
    displayScreen();//Display intro to program

    //////////////////

    do{
        sby=sortBy(st);//Ask for letter to sort by
        cout<<endl;
        for(int i=0; i<YEARS; i++) 
            displayInput(ppg,ast,rbs,player,nyears,s,sby,h,yrNum,compYears,position,nsearch,index);
        if(sby=='E')//If user input is E
        {
            exit(0);
        }
        if(st=='C')
        {
            searchPlayer(nyears,nsearch,player,position,ppg,ast,index,rbs);
        }
        cout<<" Player\t\tSeason\t\tPos\tPPG\tAST\tRBS"<<endl;
        cout<<endl;///////////////////////////////////
        displayOutput(ppg,ast,rbs,player,nyears,s,position);//Display total output
        cout<<endl;///////////////////////////////////////
        st++;
    }while(true);

    if(stp==1)
    {
        cout<<endl;
    }
    system("pause");
    return 0;
}

char sortBy(char)//Ask user for options input
{
    char t;
    char sby;
    cout<<"Sort by: ";
    cin>>sby;
    while(sby!='P'&&sby!='A'&&sby!='R'&&sby!='C'&&sby!='E')
    {
        cout<<"Re-Enter: "<<endl;
        cin>>sby;
    }
    t=sby;
    return t;
}

int getYear(int count)//Get year for searchPlayer binary search
{
    int yearNum;
    int tot=0;
    cout<<endl;
    ////
    cout<<"Enter year: "<<((count%2)+1)<<" ";
    cin>>yearNum;
    ////
    
    while(yearNum<MIN_YEAR||yearNum>MAX_YEAR)
    {
        cout<<"Please enter between 2001 and 2012: ";
        cin>>yearNum;
    }
    tot = yearNum;
    return tot;
}

double sort2(string players[NUM_PLAYERS],double*ppg,double*ast,double*rbs,int*nyears,int*s,string*position)
{
    int t=0;
    double temp=0;
    for(int i=0; i<YEARS; i++)
    {
        if(ppg[i]<ppg[i+1])
        {
            temp=ppg[i];
            ppg[i]=ppg[i+1];
            ppg[i+1]=temp;
            t=temp;
            double tmp=ast[i];
            ast[i]=ast[i+1];
            ast[i+1]=tmp;
            double tmp2=rbs[i];
            rbs[i]=rbs[i+1];
            rbs[i+1]=tmp2;
            string tr=players[i];
            players[i]=players[i+1];
            players[i+1]=tr;
            int yr=nyears[i];
            nyears[i]=nyears[i+1];
            nyears[i+1]=yr;
            int strt=s[i];
            s[i]=s[i+1];
            s[i+1]=strt;
            string pos=position[i];
            position[i]=position[i+1];
            position[i+1]=pos;
        }
    }
    return t;
}

double sort3(string players[NUM_PLAYERS],double*ast,double*ppg,double*rbs,int*nyears,int*s,string*position)
{
    int t=0;
    double temp=0, tmp=0, tmp2=0;

    for(int i=0; i<YEARS; i++)
    {
        if(i+1 < YEARS){
            if(ast[i]<ast[i+1])
            {
                temp=ast[i];
                ast[i] = ast[i+1];
                ast[i+1] = temp;
                t=temp;
                tmp=ppg[i];
                ppg[i]=ppg[i+1];
                ppg[i+1]=tmp;
                tmp2=rbs[i];
                rbs[i]=rbs[i+1];
                rbs[i+1]=tmp2;
                string tr=players[i];
                players[i]=players[i+1];
                players[i+1]=tr;
                int yr=nyears[i];
                nyears[i]=nyears[i+1];
                nyears[i+1]=yr;
                int strt=s[i];
                s[i]=s[i+1];
                s[i+1]=strt;
                string pos=position[i];
                position[i]=position[i+1];
                position[i+1]=pos;
            }
        }
    }
    return t;
}

double sort4(string players[NUM_PLAYERS],double*rbs,double*ppg,double*ast,int*nyears,int*s,string*position)
{
    int t=0;
    double temp=0, tmp=0, tmp2=0;

    for(int i=0; i<YEARS; i++)
    {
        if(i+1 < YEARS){
            if(rbs[i]<rbs[i+1])
            {
                temp=rbs[i];
                rbs[i] = rbs[i+1];
                rbs[i+1] = temp;
                t=temp;
                tmp=ppg[i];
                ppg[i]=ppg[i+1];
                ppg[i+1]=tmp;
                tmp2=ast[i];
                ast[i]=ast[i+1];
                ast[i+1]=tmp2;
                string tr=players[i];
                players[i]=players[i+1];
                players[i+1]=tr;
                int yr=nyears[i];
                nyears[i]=nyears[i+1];
                nyears[i+1]=yr;
                int strt=s[i];
                s[i]=s[i+1];
                s[i+1]=strt;
                string pos=position[i];
                position[i]=position[i+1];
                position[i+1]=pos;
            }
        }
    }
    return t;
}

double sort5(string players[NUM_PLAYERS],double*rbs,double*ppg,double*ast,int*nyears,int*s,string*position)
{
    int t=0;
    double temp=0, tmp=0, tmp2=0;

    for(int i=0; i<YEARS; i++)
    {
        if(i+1 < YEARS){
            if(nyears[i]>nyears[i+1])
            {
                temp=rbs[i];
                rbs[i] = rbs[i+1];
                rbs[i+1] = temp;
                t=temp;

                tmp=ppg[i];
                ppg[i]=ppg[i+1];
                ppg[i+1]=tmp;

                tmp2=ast[i];
                ast[i]=ast[i+1];
                ast[i+1]=tmp2;

                string tr=players[i];
                players[i]=players[i+1];
                players[i+1]=tr;

                int yr=nyears[i];
                nyears[i]=nyears[i+1];
                nyears[i+1]=yr;

                int strt=s[i];
                s[i]=s[i+1];
                s[i+1]=strt;
                string pos=position[i];
                position[i]=position[i+1];
                position[i+1]=pos;
            }
        }
    }
    return t;
}

void displayScreen()
{
    cout<<"--------------Stat Organizer------------------"<<endl;
    cout<<endl;
    cout<<"NBA MVPs from 2000-2001 season to 2010-2011 season."<<endl;
    cout<<endl;
    cout<<"Press 'P' to sort by PPG. "<<endl;
    cout<<"Press 'A' to sort by AST. "<<endl;
    cout<<"Press 'R' to sort by REB(Per-Game) "<<endl;
    cout<<"Press 'C' to compare two players "<<endl;
    cout<<"Press 'E' to exit.";
    cout<<endl;
    cout<<"EXAMPLE 'P' will sort by PPG"<<endl;
    cout<<endl;
}

int binarySearch(int array[], int numElems, int value)//Index each player for search
{
    int first = 0, // First array element
    last = numElems-1, // Last array element
    middle, // Mid point of search
    position = -1; // Position of search value
    bool found = false; // Flag
    while (!found && first <= last)
    {
        middle = (first + last) / 2; // Calculate mid point
        if (array[middle] == value) // If value is found at mid
        {
            found = true;
            position = middle;
        }
        else if (array[middle] > value) // If value is in lower half
            last = middle - 1;
        else
            first = middle + 1; // If value is in upper half
    }
    return position;
}

void displayInput(double*ppg,double*ast,double*rbs,string*player,int*nyears,int*s,char&sby,double&h,int*yrN,int&compYears,string*position,int*nsearch,int index[COMPARED_PLAYER])
{
    if(sby=='P')
    {
        h=sort2(player,ppg,ast,rbs,nyears,s,position); //Sort by ppg
    }
    if(sby=='A'){
        h=sort3(player,ast,ppg,rbs,nyears,s,position); //Sort by ast
    }
    if(sby=='R')
    {
        h=sort4(player,rbs,ppg,ast,nyears,s,position); //Sort by rbs
    }
    if(sby=='C')
    {
        for(int t=0; t<YEARS; t++)
            h=sort5(player,rbs,ppg,ast,nyears,s,position); //Sort by rbs
        searchPlayer(nyears,nsearch,player,position,ppg,ast,index,rbs);
    }
    //Sort by: P
    // Player Season Pos PPG AST RBS
    //Allen Iverson 2000-2001 PG/SG 31.1 4.6 3.8
    //Lebron James 2009-2010 SF/SG 29.7 8.6 7.3
    //Lebron James 2008-2009 SF/SG 28.4 7.2 7.6
    //Kobe Bryant 2007-2008 SG 28.3 5.4 6.3
    //Lebron James 2011-2012 SF/SG 27.1 6.2 7.9
    //Tim Duncan 2001-2002 PF/C 25.5 3.7 12.7
    //Derrick Rose 2010-2011 PG 25.0 7.7 4.1
    //Dirk Nowitzki 2006-2007 PF 24.6 3.4 8.9
    //Kevin Garnett 2003-2004 F 24.2 5.0 13.9
    //Tim Duncan 2002-2003 PF/C 23.3 3.9 12.9
    //Steve Nash 2005-2006 PG 18.8 10.5 4.2
    //Steve Nash 2004-2005 PG 15.5 11.5 3.3

}

void displayOutput(double*ppg,double*ast,double*rbs,string*player,int*nyears,int*s,string *position)
{
    for(int i=0; i<YEARS;i++)
    {
        cout<<player[i]<<"\t"<<s[i]<<"-"<<nyears[i]<<"\t"<<position[i]<<"\t"<<fixed<<setprecision(1)<<ppg[i]<<"\t"<<setprecision(1)<<ast[i]<<"\t"<<rbs[i];
        cout<<endl;
    }
}

void write(int*s,int*nyears,double*ppg,double*ast,double*rbs,string*player,string*position)
{
    ofstream ppgFile;
    ofstream myFile;
    ofstream astFile;
    ofstream rbsFile;
    ofstream yr1File;
    ofstream posFile;
    myFile.open("Players.txt");
    ppgFile.open("PPG.txt");
    astFile.open("AST.txt");
    rbsFile.open("RBS.txt");
    yr1File.open("YR1.txt");
    posFile.open("Positions.txt");
    ppgFile<<"PPG"<<endl;
    ppgFile<<endl;
    astFile<<"AST"<<endl;
    astFile<<endl;
    rbsFile<<"RBS"<<endl;
    rbsFile<<endl;
    myFile<<"Players"<<endl;
    myFile<<endl;
    posFile<<"Positions"<<endl;
    posFile<<endl;
    for(int i=0; i<YEARS; i++)
    {
        ppgFile<<ppg[i]<<endl;
        myFile<<player[i]<<endl;
        astFile<<ast[i]<<endl;
        rbsFile<<rbs[i]<<endl;
        yr1File<<s[i]<<"-"<<nyears[i]<<endl;
        posFile<<position[i]<<endl;
    }
    ppgFile.close();
    myFile.close();
    astFile.close();
    rbsFile.close();
    yr1File.close();
}//Write to file

void searchPlayer(int nyears[],int* nsearch, string* player,string* position,double* ppg,double* ast,int index[COMPARED_PLAYER],double*rbs)
{
    int count=0;
    for(int i=0; i<COMPARED_PLAYER; i++)
    { 
        nsearch[i]=getYear(count);
        index[i]=binarySearch(nyears,YEARS,nsearch[i]);//Binary search year for name //Eg 2004: Kevin Garrnett
        count++;
        if(index[i]==-1)//If year is out of range.
            cout<<"That product number was not found.\n";
        else
        {
            //
            //Enter year: 1 2005
            //2005
            //Steve Nash
            //Enter year: 2 2009
            //2009
            //Lebron James
            cout<<nyears[index[i]]<<endl;
            cout<<player[index[i]]<<endl;
        }
        cout<<endl;
    }

    cout<<"______________________________________"<<endl;
    cout<<"Year#1 "<<player[index[0]]<<"("<<nyears[index[0]]<<")\n\nYear#2 "<<player[index[1]]<<"("<<nyears[index[1]]<<")"<<endl;
    cout<<"----------------------------------"<<endl;
    cout<<endl;
    cout<<"----------------------------------"<<endl;
    cout<<"YR: "<<"\t"<<nyears[index[0]]<<"\t"<<nyears[index[1]]<<endl;//Display year for [0]=1 and [1]=2
    cout<<"POS: "<<"\t"<<position[index[0]]<<"\t"<<position[index[1]]<<endl;//Display position for [0]=1 and [1]=2
    cout<<"PPG:"<<"\t"<<ppg[index[0]]<<"\t"<<ppg[index[1]]<<endl;//Display ppg for [0]=1 and [1]=2
    cout<<"APG"<<"\t"<<ast[index[0]]<<"\t"<<ast[index[1]]<<endl;//Display ast for [0]=1 and [1]=2
    cout<<"RBS"<<"\t"<<rbs[index[0]]<<"\t"<<rbs[index[1]]<<endl;//Display rbs for [0]=1 and [1]=2
    cout<<"----------------------------------"<<endl;
}
