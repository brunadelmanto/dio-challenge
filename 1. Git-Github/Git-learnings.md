# Learnings in Git | Github

###### *February 2023*

Git is compound by: **commit > tree > blob**, that have a *sha1* (file identification)

The most important learning in this class was the codes needed to push a repository to the server. So for me its very important it describes all the codes that we have to remember.

I know that there is a Github program, most easy to work, but its important learning the basis of the Git, with the Git Bash.

So next I will write all the important things that I have to remember.



----

The first thing we have to do is create a new repository and for do that I open the Git Bash in a specificity folder of my Windows disc C and started with the codes:

Create a new repository on Github with a README.md file

- git clone https://github.com/user-name/repository-name.git

- cd dio-challenge/ (enter the folder)

- mkdir git-github (create a folder named git-github)

- cd git-github/ (enter the folder)

- echo > learning.md (create a Markdown file, a simple html structure)

- ls (list all the files in this folder to confirm the creator)

- cd .. (back the folder)

So we can edit this file in the Typora program. After edit this, we can push to Github server with the codes:

- git add * (add all the files to the Stage of Git)
- git commit -m "new repository" (write a description message to this commit)
- git push origin master (push this files to the Github server)



---------



### 	Git commands:

- git init = create repository
- git add * = add all modification files tho the Staged area (wating to be commit)
- git add [file-name] [folder] = add only the file cited to the Staged area 
- git commit -m "message" = commit in server
- git status = show file status
- mv file-name ./folder-name/ = move file
- ctrl + L = clear
- echo > file.md = create new file with .md format 
- git config --list = check the git settings to see if it's the same as Github. Type "Q" to leave

- git config --global --unset user.name = reset the name, you must open the command again without the --unset to create the user
- create repository in Git, copy the link and start the command: git remote add origin git@github.com:username/folder.git
- git remote -v = list registered remote lists
- git push origin master = push local repository to server's
- git pull origin master = will pull the repository from the server to the location
- git clone https://github.com/username/repository.git = pull a repository to the location
- cd .. = back folder
- cd /c/workspace = access the workspace part
- clear = clear
- mkdir folder-name = create folder
- ls = list
- ls -a = show hidden files
- git init = start running the command to manage and version the code



Set up the information of who makes the commits for the first time:

- git config --global user.email "youremail"
- git config --global user.name yourusername

You can see how to install Git [here](https://github.com/brunadelmanto/dio-challenge/blob/main/1.%20Git-Github/Git-installation.md).

-----



