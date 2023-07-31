Git commands

1: git status
2: git init
3: git add --a : add files in staging area
4: git commit -m “Comments”
5: git log : History of commits
6:  git add first.txt : add only first.txt in staging area

L-5:
7: rm -rf
8: git clone “link” alias

L-7:
10: touch .gitignore
*.log
Dir/ :kisi bhi folder k andr wala dir
/dir/ sirf bhr wala dir

L-8:
11: git diff : if a file is modified just command will show the difference between the two. (Compare working area and staging directory)
12: git diff —staged : compare last commit with staging area
13: git commit -a -m : Direct commit of tracked files
14: git rm file.format : to delete using git. after deleting changes are automatically staged.
15: git mv first.txt first_renamed.txt: renamed and staged (by the way it means move the content of first.txt to first_renamed.txt)
16: git rm —cached file.txt : This will untrack the file

File first needs to be untracked after adding it to .gitignore otherwise it will be shown as modified.

If a file is deleted and a new file is created before commit or stagging, On git status it will show as renamed.

L-11:
17: git log -p: 
18: git log -p -’n’: n is the number
19: git log —stat: log in short and detailed
20:git log —pretty=oneline
21: git log —pretty=short
22: git log —pretty=full
23 git log —since=2.days
24: git log —since=2.weeks / months
25: git log —pretty=format:"%h — %an” : show git log in format (abbreviated commit hash) %h and %an (author name)
check out various types of format o google.
26: git commit —amend (vim editor)

 L-12:
27: Git restore —staged file.txt: unstage the file
28: Git checkout — first.txt: if the file is unstaged and changes made to it, this command can revert back and now the file is staged saved and working tree is clean: Simple h bro pichle commit se match krwa dega
Khatarnak bhi hai kyuki fir isse naya wala code nhi ayega 😬
This command doesnt work on git ignore.
29: git checkout -f: jo jo modified file usko pichle commit se mile mega even gitignore ko

L-13: working with git and github
30: Git remote: Provides name of the remote directory eg: origin
31: git remote add origin git@github.com:unhumanly-geek/JustPlaying.git: origin named added in github
32: git push -u origin main: Push to gihub
33: pbcopy < ~/.ssh/id_ed25519.pub: copy ssh key from git
