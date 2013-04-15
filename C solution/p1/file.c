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
 	int dados[2];
 	int buf;
 	int i, estado;

 	pipe(dados);
 	pid = fork();
 	if(pid>0){
 		close(dados[1]);
 		/*processo pai*/
 		for (i = 1; i < (max/2)-1; i++)
 		{
 			if ((i % 3 == 0) || (i % 5 == 0))
 			{
 				soma+=i;
 			}
 		}
 		wait(&estado);
 		read(dados[0],&buf,sizeof(int));
 		close(dados[0]);
 		soma+=buf;
 	}else{
 		/*processo filho*/
 		close(dados[0]);
 		for (i = (max/2); i < max; i++)
 		{
 			if ((i % 3 == 0) || (i % 5 == 0))
 			{ 				soma+=i;
 			}
 		}
 		buf = soma;
 		write(dados[1],&buf,sizeof(int));
 		close(dados[1]);
 		exit(pid);
 	}

 	printf("%d\n", soma);
 	return 0;
 }