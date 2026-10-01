#this is just learning to hand-on git.

About pull requests
First, check your current setup:

git status
git branch
git remote -v

Now get the latest code from GitHub:

git switch main
git pull origin main

Create your own feature branch
eg : git switch -c feature/user-registration 

Check your branch:
git branch

After writing your code, run:
git status
git add .
git commit -m "Add user registration model"
git push -u origin feature/user-registration

Done run this sequentially.