#include <iostream>

using namespace std;

struct Person
{

    char name [50];
    int flavor;

};

class ADTqueue
{
    private:

        int queue[10];
        int head,tail;

    public:

    ADTqueue()
    {
        tail = -1;
        head = 0;
    }

    int empty()
    {
        if(head == tail+1)
            return 1;
        else
            return 0;
    }

    int full()
    {
        if(tail == 9)
            return 1;
        else
            return 0;
    }

    void append(int num)
    {
        if (!full())
        {
            tail++;
            queue[tail] = num;
        }
        else
        {
            cout<<"Queue is Full"<<endl;
        }
    }

    int serve()
    {
        int num;

        if(!empty())
        {
            num = queue[head];
            head++;
            return num;
        }
        else
        {
            cout<<"Queue is Empty"<<endl;
            return 0;
        }
    }
};

int main()
{
    Person p;
    ADTqueue q;

    char name [50];
    int flavor;
    string names [2];

    cout<<"Do you know that the flavor of ice cream can reveal one's personality?\n";

    for(int i=0; i<2; i++)
    {

        cout<<"\nEnter name : ";
        cin>>p.name;
        names[i] = p.name;

        cout<<"Enter flavor : \n <1=chocolate\t2=vanilla\t3=strawberry\t4=mixed flavor> \n";
        cin>>p.flavor;

        q.append(p.flavor);

    }

    for(int i=0; i<2; i++)
    {

        int selection = q.serve();

        cout<< names[i] << "\t\t";

        switch (selection)
        {

            case 1:
            cout<<"Sensitive and often daydreaming about past and future.\n";
            break;

            case 2:
            cout<<"Friendly, easygoing and has many friends.\n";
            break;

            case 3:
            cout<<"Affectionate, giving, loving and very understanding.\n";
            break;

            case 4:
            cout<<"Negotiator and will do anything to avoid open confict.\n";
            break;


        }

    }

    return 0;
}
