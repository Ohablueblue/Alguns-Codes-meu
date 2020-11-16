#include <stdio.h>
 
int main () {
	char s[1000] , r[1000];
	int begin ,end ,count =0;
	printf ("Insira uma string \n");
	gets(s);
	// Calculando uma stringblength
	while (s[count]!='\0')
	count++;
	end = count - 1;
	for (begin=0; begin<count ; begin++){
		r[begin]=s[end];
		end--;}
		r[begin]='\n';
		printf ("%s\n",r);
		
	return 0;
}
 
