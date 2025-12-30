module.exports = {
  testDir: './tests',
  use: { 
    baseURL: 'https://www.w3.org/WAI/',
    headless: true 
  },
  projects: [{ name: 'chromium', use: { browserName: 'chromium' } }]
};
