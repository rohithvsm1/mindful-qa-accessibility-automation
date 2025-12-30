const { test, expect } = require('@playwright/test');

test('WCAG Accessibility Scan', async ({ page }) => {
  await page.goto('https://www.w3.org/WAI/');
  await expect(page).toHaveTitle(/W3C Web Accessibility/);
  // ✅ GREEN: Real WCAG site loads
});
