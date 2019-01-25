source ~/.bash_profile
cd /Users/devrabbit/Desktop/SmartQE
git init
 git add .
git rm -r --cached target
git rm -r --cached test-output
git rm -r --cached gitcommands.bat
git rm -r --cached gitcommands.sh
git rm -r --cached APIReports
git rm -r --cached MobileReports
git rm -r --cached WebReports
git commit -m "first commit"
git remote add origin https://santhosh-annam:github7489.srs@github.com/devrabbititsol/SmartQETest.git
git push -u origin master

