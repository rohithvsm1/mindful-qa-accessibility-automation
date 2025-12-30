const { test, expect } = require('@playwright/test');

test('WCAG baseline check', async ({ page }) => {
  await page.goto('https://www.w3.org/WAI/');
  await expect(page).toHaveTitle(/Web Accessibility/);
  console.log('✅ WCAG site accessible!');
});
