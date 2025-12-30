
---

## **WCAG Playwright Demo README**

♿ Playwright WCAG Demo [CI/CD LIVE]
WCAG 2.2 AA automation with axe-core integration

🎯 DEMO PURPOSE
Accessibility as release gate - 50+ WCAG checks

🛠 IMPLEMENTATION STEPS

# 1. Setup Playwright
npm init -y

npm i @playwright/test @axe-core/playwright

# 2. Config (playwright.config.js)
module.exports = {

  use: { 
  
    accessibility: { runs: 2 },
    
    trace: 'on-first-retry'
  },
  
  projects: ['chromium', 'firefox', 'webkit']
  
};

# 3. Run WCAG Suite

npx playwright test accessibility.spec.js

# 4. CI/CD Workflow

.github/workflows/accessibility-ci.yml

🔥 TECHNICAL FEATURES

✅ axe-core + custom WCAG rules

✅ Lighthouse CI scoring (90+ required)

✅ Cross-browser matrix

✅ Trace Viewer + screenshots

✅ Live: https://github.com/rohithvsm1/mindful-qa-accessibility-automation/actions
