/* ---------Project Euler --------- *
 * ---------- Problem01 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>

 int main()
 {
 	pid_t pid;
 	int max = 1000;
 	int soma = 0;
 	int i, estado;

 	pid = fork();
 	if(pid>0){
 		/*processo pai*/
 		for (i = 1; i < (max/2); i++)
 		{
 			if ((i % 3 == 0) || (i % 5 == 0))
 			{
 				soma+=i;
 			}
 		}
 		wait(&estado);
 		soma+=WEXITSTATUS(estado);
 	}else{
 		/*processo filho*/
 		for (i = (max/2); i < max; i++)
 		{
 			if ((i % 3 == 0) || (i % 5 == 0))
 			{ 				soma+=i;
 			}
 		}
 		exit(soma);
 	}

 	printf("%d\n", soma);
 	return 0;
 }